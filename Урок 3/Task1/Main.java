public class Main {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(2, 2);

        rc.ChanelDown();
        System.out.println(String.format("Канал: %s", rc.GetChanel()));
        rc.ChanelUp();
        System.out.println(String.format("Канал: %s", rc.GetChanel()));
        rc.ChanelUp();
        System.out.println(String.format("Канал: %s", rc.GetChanel()));

        rc.VolumeDown();
        System.out.println(String.format("Громкость: %s", rc.GetVolume()));
        rc.VolumeUp();
        System.out.println(String.format("Громкость: %s", rc.GetVolume()));
        rc.VolumeUp();
        System.out.println(String.format("Громкость: %s", rc.GetVolume()));
        rc.VolumeUp();
        System.out.println(String.format("Громкость: %s", rc.GetVolume()));
    }
}
