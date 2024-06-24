public class Usuario {
  
  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume Atual : " +smartTv.volume);
    

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual : " + smartTv.canal);
    System.out.println("Volume atual : " + smartTv.volume);

   

    smartTv.ligar();
    System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
  
    smartTv.desligar();
    System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
  }

  private static void diminuirVolume() {
  }
}
