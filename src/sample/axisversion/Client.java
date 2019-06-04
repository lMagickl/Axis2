package sample.axisversion;

public class Client{
	public static void main(String[] args) {
		System.out.println("hello\n");
		try{
			VersionStub stub = new VersionStub("http://localhost:8080/axis2/services/Version");
			System.out.println(" Version du client : " + stub.getVersion(new VersionStub.GetVersion()).get_return());
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\n\n\n");
		}
	}
}