package loginRegisterAction;

import com.opensymphony.xwork2.ActionSupport;
import loginRegisterDao.LoginRegisterInfo;
import PO.UserInfoPO;
import java.util.List;

public class LoginAction extends ActionSupport{
    private String userName;
    private String password;
    private String message="error";
    private List list;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void validate(){
        if(this.getUserName()==null||this.getUserName().length()==0){
            addFieldError("userName","�û�������Ϊ�գ�");
        }else{
            LoginRegisterInfo info=new LoginRegisterInfo();
            list=info.queryInfo("userName", this.getUserName());
            if(list.size()==0){
                addFieldError("userName","���û���δע�ᣡ");
            }else{
                UserInfoPO ui=new UserInfoPO();
                int count=0;
                for(int i=0;i<list.size();i++){
                    count++;
                    ui=(UserInfoPO)list.get(i);
                    if(this.getUserName().equals(ui.getUserName())){
                        if(ui.getPassword().equals(this.getPassword())){
                            message="success";
                        }else{
                            addFieldError("password","��¼���벻��ȷ��");
                        }
                    }
                }
            }
        }
    }
    public String execute() throws Exception{
        return message;
    }
}