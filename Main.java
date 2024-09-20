public class Main{
    public static void main(String[] args) {
        
        Artist artist1 = new Artist("Iqbal");

        Artwork artwork1 = new Artwork("shikwa", 1900, artist1);
        
        Artwork artwork2 = new Artwork("jawab e shikwa", 1995);

        //artwork2.display();

        System.out.println("Artworks:");
        artwork1.display();
        artwork2.display();

        Artwork shallowCopy = new Artwork(artwork1); 
        Artwork deepCopy = artwork1.deepCopy();

        artist1.setName("saad");

        System.out.println("After changing artist name:");
        artwork1.display();
        shallowCopy.display(); 
        deepCopy.display(); 
    }
}