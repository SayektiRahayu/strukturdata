package nodeantri;

/**
 *
 * Sayekti
 */
public class Antri {
    int size = 0;
    NodeAntri head, tail;
    
    //constructor antri
    public Antri() {
        head = tail = null;
    }
    
    //tambah antrian
    public void enqueue(String name, String need) {
        //memori node baru
        NodeAntri newNode = new NodeAntri();
        
        //masukan pesanan
        newNode.Nama = name;
        newNode.Menu = need;
        newNode.next = null;
        
        //jika queue masih kosong
        if(head == null) {
            head = tail = newNode; 
        }
        //jika q ada isinya, assign ke keselannjutnya
        else {
            tail.next = newNode;
            tail = newNode;
        }
        
        //tambah size
        size++;     
    }
    
    //menghapus antrian
    public void dequeue() {
        //jika antrian kosong
        if(head == null) {
            System.out.println("Tidak Ada Pesanan1");
        }
        else {
            head = head.next;
            size--;
        }
    }
    
    //return size
    public int queue_size() {
        return size;
    }
    
    //melihat antrian
    public void queue_view() {
        //jika kosong
        if(size == 0) {
            System.out.println("Tidak Ada Pesanan!");
        }
        else {
            NodeAntri tempNode = head;
            //print antrian
            System.out.println("Nomor\t||  Nama\t||   Pesanan\t||");
            for(int i = 1; i<=size; i++) {
                if(tempNode != null) {
                    System.out.println(+(i)+".\t||"+(tempNode.Nama)+"\t||"  +(tempNode.Menu)+"\t||");
                    tempNode = tempNode.next; 
                }
            }
        }
    }
}
