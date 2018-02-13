public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; //Essa linha retorna um valor de referencia.

        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesma conta!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
