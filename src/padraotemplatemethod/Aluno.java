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
public abstract class Aluno {
    private String nome;
    private String instituicaoOrigiem;
    
    public abstract String getOrigem();
    
    public String getDadosAluno(){
        return "Aluno: "+getNome()+ " - Origem "+
                getOrigem()+ getInstituicaoOrigiem();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicaoOrigiem() {
        return instituicaoOrigiem;
    }

    public void setInstituicaoOrigiem(String instituicaoOrigiem) {
        this.instituicaoOrigiem = instituicaoOrigiem;
    }
     
    
    
    
}
