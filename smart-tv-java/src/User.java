/**Classe que simula um usuário interagindo com a tv */
public class User {
    public static void main(String[] args)  {
        SmartTv smartTv = new SmartTv();
        int i = 0;
        /**Ligo ou desligo a TV 
         * A TV inicia desligada, logo, na primeira chamada ela é ligada.
         * Por fim, a próxima chamada deste método desliga a TV no fim do código.
        */
        smartTv.powerOnOff();
        /**Laço para passar 5 canais em ordem crescente */
        for(i=0; i<5; i++){
            smartTv.channelUp();
        }
        /****Laço para voltar 2 canais */
        for(i=0; i<2; i++){
            smartTv.channelDown();
        }
       /**Canal alterado para o 37 */
        smartTv.changeChannel(37);
        /**Aumentando o volume em +5 */
        for(i=0; i<5; i++){
            smartTv.volumeUp();
        }
        /**Diminuindo o volume em -2 */
        for(i=0; i<2; i++){
            smartTv.volumeDown();
        }

        smartTv.powerOnOff();
    }
}
