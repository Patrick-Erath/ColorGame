// starts after a triplet ATG and ends before a triplet TAG, TAA, or TGA.
// Furthermore, the length of a gene string is a multiple of 3, and the gene does not contain any of the triplets ATG, TAG, TAA, or TGA
import java.util.ArrayList;
import java.util.Scanner;

public class Bioinformatics {
    public static void main(String[] args){
        findGenes();
    }

    static void findGenes(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome = scanner.nextLine();
        boolean triplet = false;
        ArrayList<Character> Genes = new ArrayList<Character>();

        for(int i=0; i<genome.length(); i++){  //Iterate over string
            if(i+2<=genome.length()-1 && genome.charAt(i)=='A' && genome.charAt(i+1)=='T' && genome.charAt(i+2)=='G' && i+5<=genome.length()-1){
                if(genome.charAt(i)=='A' && genome.charAt(i+1)=='T' && genome.charAt(i+2)=='G'){
                    while(genome.charAt(i+3)!='T' && (genome.charAt(i+4)!='A' || genome.charAt(i+4)!='G') && (genome.charAt(i+5)!='G' || genome.charAt(i+5)!='A')){
                        Genes.add(genome.charAt(i+3));
                        Genes.add(genome.charAt(i+4));
                        Genes.add(genome.charAt(i+5));
                    }
                }
            }
        }

        System.out.println(Genes);
    }
}
