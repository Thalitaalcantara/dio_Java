public class MinhaClasse {

  public static void main(String[] args) {

    String primeiroNome = "Thalita";
    String segundoNome = "Carvalho";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

public static String nomeCompleto (String primeiroNome, String segundoNome){
  return "resutado do método " + primeiroNome.concat(" ").concat(segundoNome);

}  
}