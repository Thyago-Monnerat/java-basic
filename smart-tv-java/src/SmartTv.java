public class SmartTv {
    boolean onOff = false;
    int channel = 0;
    int volume = 0;

    public void powerOnOff(){
        onOff = !onOff;
        String status = onOff ? "Ligando" : "Desligando";
        System.out.println(status + " Tv");
    }

    public void volumeUp(){
        volume++;
        System.out.println("Aumentando volume " + volume);
    }
    public void volumeDown(){
        volume--;
        System.out.println("Diminuindo volume " + volume);
    }

    public void channelUp(){
        channel++;
        System.out.println("Mudando o canal para " + channel);
    }

    public void channelDown(){
        channel--;
        System.out.println("Mudando o canal para " + channel);
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
        System.out.println("Mudando para o canal " + channel);
    }
}
