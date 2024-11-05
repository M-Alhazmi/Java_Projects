/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlp;
import java.util.Arrays;
import java.util.StringTokenizer;  
import static nlp.NLP.IDF;
/**
 *
 * @author moham
 */
public class NLP {

public static double TFIDF[][] = new double[4][7];
public static double TF[][]= new double[4][7];
public static double IDF[]= new double[7];
    public static void main(String[] args) {
       String D1 ="Vaccination Application";
       String D2 ="Covid Vaccination Center";
       String D3 ="Health of Pilgrims";
       String D4 ="Certificate of Vaccination";
       String DCT[]={"application","vaccination","covid","pilgrims",
           "health","certificate","center"};


       for(int i=0; i<7;i++)
       TF(D1,DCT,i,1);
    
       System.out.print("\n");
       for(int i=0; i<7;i++)
       TF(D2,DCT,i,2);
       
       System.out.print("\n");
       for(int i=0; i<7;i++)
       TF(D3,DCT,i,3);
       
       System.out.print("\n");
       for(int i=0; i<7;i++)
       TF(D4,DCT,i,4);
 
        System.out.print("\n TF matrix \n");
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 7; j++) {
            System.out.print(TF[i][j] + " ");
        }
        System.out.println();
    }
 System.out.print("\n");
       
        for(int i=0; i<7;i++)
       TFIDF(DCT,i,4);
        
       for (int i = 0; i < 4; i++) {
           System.out.print("TFIDF for D"+(i+1)+" ");
        for (int j = 0; j < 7; j++) {
            System.out.print(TFIDF[i][j] + " ");
        }
        System.out.println();
    }
 System.out.print("\n");
         
 System.out.print("normalized \n");
 double [][]normalizeVector= normalizeVector();
      
       
           for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 7; j++) {
            System.out.print(normalizeVector[i][j] + " ");
        }
        System.out.println();
    }
         System.out.println("\nCosine Similarity Scores for the Query 'Covid Vaccination':");
        double[] queryVector = calculateQueryVector("Covid Vaccination", DCT);
        
         for (int i = 0; i < 4; i++) {
        System.out.print("D"+queryVector[i]+" ");
         }
        
}
    


    
    


public static void TF(String D,String []T,int x,int z){
int times=0;
StringTokenizer st = new StringTokenizer(D);  
int length =st.countTokens();
String term =T[x];

 while (st.hasMoreTokens()){ 
     
     
String currentToken = st.nextToken().toLowerCase();

 if (term.equals(currentToken)){
    times++;
}
 
}
 int r =z-1;
 TF[r][x] = (double) times/length;
 
 System.out.println("TF D"+z+ " of " +term+" is "+times+"/"+length+" = "+TF[r][x]);
            }


public static void TFIDF(String[] T, int x, int N) {
        int documentsWithTerm = 0;
        String term = T[x];

        String[] documentCollection = {
            "Vaccination Application",
            "Covid Vaccination Center",
            "Health of Pilgrims",
            "Certificate of Vaccination"
        };
         
        for (String document : documentCollection) {
            StringTokenizer st = new StringTokenizer(document);
            while (st.hasMoreTokens()) {
                String currentToken = st.nextToken().toLowerCase();
                if (term.equals(currentToken)) {
                    documentsWithTerm++;
                    break;
                }
            }
        }
        
        
        
        double round = Math.log(((double) N / (documentsWithTerm  )));
        IDF[x]=round/Math.log(2);
        
        System.out.println("IDF of " + term + " is " + IDF[x]);
    
      
     
  for (int i = 0; i < 4; i++) {
      
        for (int j = 0; j < 7; j++) 
            
           TFIDF[i][j]=TF[i][j]*IDF[i];
        }
      
    }



 
   
    public static double[][] normalizeVector() {
        int g=0;
        double [][]t = new double[4][7];
        double norm = 0.0;
          for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 7; j++) { 
            norm += Math.pow(TFIDF[i][j], 2);
        }
          }
        norm = Math.sqrt(norm);

        double[][] normalizedVector = new double[4][7];
         for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 7; j++) {
                      t[i][j]=IDF[i]*TF[i][j];               
            normalizedVector[i][j] = t[i][j]/norm;
            
        }
        
    }
         return normalizedVector;
    }
    
        public static double[] calculateQueryVector(String query, String[] DCT) {
        double[] queryVector = new double[7];
        StringTokenizer st = new StringTokenizer(query);
        int times =0;
        while (st.hasMoreTokens()) {
            String term = st.nextToken().toLowerCase();
            for (int i = 0; i < 7; i++) {
                if (term.equals(DCT[i])) {
                    queryVector[i]++;
                    break;
                }
            }
            
        }
        return normalizeQuery(queryVector);
    }
    
  public static double[] normalizeQuery(double[] vector) {
        double norm = 0.0;
        for (double value : vector) {
            norm += Math.pow(value, 2);
        }
        norm = Math.sqrt(norm);

        double[] normalizeQuery = new double[vector.length];
        for (int i = 0; i < 7; i++) {
            vector[i]*=IDF[i];
            normalizeQuery[i] = (double) vector[i] / norm;
        }
        return calculateCosineSimilarity(normalizeQuery);
    }

    
        
    public static double [] calculateCosineSimilarity(double[] queryVector) {
        double similarity[] = new double[4];
                double ranks[]=new double[4];
                double dotProduct = 0.0;
            double normA = 0.0;
            double normB = 0.0;
            for (int i= 0; i < 7; i++) {
                dotProduct += IDF[i] * queryVector[i];
                normA += Math.pow(IDF[i], 2);
                normB += Math.pow(queryVector[i], 2);
            }
                 for (int i= 0; i <4 ; i++) {
             similarity[i] = dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
                 }
        
        
for (int i = 0; i < 4; i++) {
    ranks[i] = 1;

    for (int j = 0; j < 4; j++) {
        if (similarity[i] <similarity[j]) {
            ranks[i]++;
        }
    }
}  
return ranks;
                }
}