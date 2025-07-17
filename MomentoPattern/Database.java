package MomentoPattern;
public class Database {
    String data;
    public Database(){
        this.data = "";
    }

    public void setState(ISnapShot snapShot){
        this.data = snapShot.getSnapInfo();
    }

    public ISnapShot getSnapShot(){
        return new SnapShot(new String(data));
    }

    public String getData(){
        return data;
    }

    public void addData(String newData){
        data += newData;
    }
}
