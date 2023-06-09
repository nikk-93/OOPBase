public class RemoteControl implements IControllable {

    private int chanel;
    private int volume;

    private int minChanel;
    private int maxChanel;
    private int minVolume;
    private int maxVolume;

    public RemoteControl(int maxChanel, int maxVolume) {
        this.maxChanel = maxChanel;
        this.maxVolume = maxVolume;
        this.minChanel = 1;
        this.minVolume = 0;

        chanel = this.minChanel;
        volume = this.minVolume;
    }

    @Override
    public void ChanelDown() {
        if (chanel - 1 < minChanel) {
            System.out.println("Это первый канал");
            return;
        }

        chanel--;
    }

    @Override
    public void ChanelUp() {
        if (chanel + 1 > maxChanel) {
            System.out.println("Это последний канал");
            return;
        }

        chanel++;
    }

    @Override
    public int GetChanel() {
        return chanel;
    }

    @Override
    public int GetVolume() {
        return volume;
    }

    @Override
    public void VolumeDown() {
        if (volume - 1 < minVolume) {
            System.out.println("Это самая низкая громкость");
            return;
        }

        volume--;
    }

    @Override
    public void VolumeUp() {
        if (volume + 1 > maxVolume) {
            System.out.println("Это самая высокая громкость");
            return;
        }

        volume++;
    }

}