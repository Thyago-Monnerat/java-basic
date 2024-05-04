public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        int i = 0;

        smartTv.powerOnOff();

        for(i=0; i<5; i++){
            smartTv.channelUp();
        }

        for(i=0; i<2; i++){
            smartTv.channelDown();
        }
       
        smartTv.changeChannel(37);
        
        for(i=0; i<5; i++){
            smartTv.volumeUp();
        }

        for(i=0; i<2; i++){
            smartTv.volumeDown();
        }
        
        smartTv.powerOnOff();
    }
}
