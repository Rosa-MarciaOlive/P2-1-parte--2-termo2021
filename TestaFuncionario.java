public class TestaFuncionario {

    public static void  main(String[] args) {

        ///Criar objetos acesspo
        Funcionario f=new Funcionario();
        //Criar objetos de acesso
        f.setNome("Rosa Márcia");
        f.setCargo("Programadora JAVA");
        f.setSalario(15000.00);

         System.out.println("Funcionario: "+f.getNome());
         System.out.println("Responsavel pelo cargo de: "+f.getCargo());
         System.out.println("Faz jus ao salário de: "+f.getSalario()+"kkkkk Amém!");
}
}