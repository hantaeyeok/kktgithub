package structural.proxy;
//프록시 객체를 두어 관리자(Admin) 계정이 아닐 경우에는 rm 이라는 명령어에 대해 수행하지 못하도록 구현
public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;
	
    public CommandExecutorProxy(String user, String pwd){
        if("ReadyKim".equals(user) && "correct_pwd".equals(pwd))
            isAdmin = true;
        executor = new CommandExecutorImpl();
    }
	
    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else{
            if(cmd.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                executor.runCommand(cmd);
            }
        }
    }
}