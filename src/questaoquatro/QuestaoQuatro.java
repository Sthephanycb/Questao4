package questaoquatro;
public class QuestaoQuatro {
    public static void main(String[] args) {
        
        HomoSapiens animal1 = new HomoSapiens();
        
        CanisFamiliaris animal2 = new CanisFamiliaris();   
        
        MuscaDomestica animal3 = new MuscaDomestica();
        
        System.out.println("A taxonomia do Homo Sapiens é: " + animal1.obterDescricao());
        System.out.println("\nA taxonomia do Canis Familiaris é: " + animal2.obterDescricao());
        System.out.println("\nA taxonomia da Musca Domestica é: " + animal3.obterDescricao());
        
    }
    
}
