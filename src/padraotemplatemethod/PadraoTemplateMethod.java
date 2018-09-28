/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraotemplatemethod;

/**
 *
 * @author yan
 */
public class PadraoTemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoGraduacao a = new AlunoGraduacao();
        a.setNome("Yan");
        a.setInstituicaoOrigiem("Estadual");
        AlunoPosGraduacao a2 = new AlunoPosGraduacao();
        a2.setNome("Aline");
        a2.setInstituicaoOrigiem("UFJF");
        
        //padrao Builder
        ExemploPadraoBuild ex = new ExemploPadraoBuild();
        ex.setExemplo1("aaaa")
                .setExemplo2("bbbb")
                .setExemplo3("asdasd")
                .setExemplo4("cccc");
        System.out.println(a.getDadosAluno());
        System.out.println(a2.getDadosAluno());
    }
    
}
