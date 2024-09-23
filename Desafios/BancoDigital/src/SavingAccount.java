public class SavingAccount extends Account {

	public SavingAccount(Client client) {
		super(client);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Saving Account ===");
		super.printCommonInfos();
	}
}