
package javalinkedlist;

public class Atividade implements Comparable<Atividade>{
    private String nome;
    private int prioridade;
    private int tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public int compareTo(Atividade outraAtividade){
        return getNome().compareTo(outraAtividade.getNome());
    }
    
        @Override
    public String toString(){
        return getNome() + " : " + getPrioridade() + " - " + getTempo() ;
    }// fim toString
    
}
