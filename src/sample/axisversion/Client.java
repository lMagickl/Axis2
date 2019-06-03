package sample.axisversion;

public class Client{
	public static void main(String[] args) {
		try{
			VersionStub stub = new VersionStub("http://localhost:8080/axis2/services/Version");
			stub.getVersion(new VersionStub.GetVersion());
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\n\n\n");
		}
	}
}