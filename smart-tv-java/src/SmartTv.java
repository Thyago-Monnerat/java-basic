/** 
 * @author Thyago
 * @since 2024
 */

/** 
    * Esse é o código de uma lógica de uma TV genérica. Conforme o autor for progredindo em seu aprendizado, mais refinado o código será! 
    */
public class SmartTv {
    
    boolean onOff = false;
    int channel = 0;
    int volume = 0;
     /** 
    * Aqui eu ligo ou desligo a tv.
    */
    public void powerOnOff(){
        onOff = !onOff;
        String status = onOff ? "Ligando" : "Desligando";
        System.out.println(status + " Tv");
    }

    /**Aumento o volume */
    public void volumeUp(){
        volume++;
        System.out.println("Aumentando volume " + volume);
    }
    /**Abaixo o volume */
    public void volumeDown(){
        volume--;
        System.out.println("Diminuindo volume " + volume);
    }
    /** Passo o canal em ordem crescente de 1 em 1 */
    public void channelUp(){
        channel++;
        System.out.println("Mudando o canal para " + channel);
    }
     /** Passo o canal em ordem decrescente de 1 em 1 */
    public void channelDown(){
        channel--;
        System.out.println("Mudando o canal para " + channel);
    }
    /**Altero o canal para um outro qualquer */
    public void changeChannel(int newChannel){
        channel = newChannel;
        System.out.println("Mudando para o canal " + channel);
    }
}
