
public class Main {

	public static void main(String[] args) {
		Client jhuan = new Client();
		jhuan.setNome("Jhuan");
		
		Account cc = new CurrentAccount(jhuan);
		Account saving = new SavingAccount(jhuan);

		cc.deposit(250.80);
		cc.transfer(700, saving);
		
		cc.printStatement();
		saving.printStatement();
	}

}