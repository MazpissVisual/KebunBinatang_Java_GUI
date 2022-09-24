
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pengunjungControler {
    private final String [] header = {"No.Kunjungan","Nama Pengunjung","Jenis Kendaraan","Tujuan"};
    private final ArrayList<Pengunjung> list = new ArrayList<>();
    
    public void read(JTable jt){
    DefaultTableModel pnj = new DefaultTableModel(null,header);
    
    for(int i=0; i<list.size(); i++){
        Object[] ob = new Object[4];
        ob[0] = list.get(i).getNomer();
        ob[1] = list.get(i).getNama();
        ob[2] = list.get(i).getKendaraan();
        ob[3] = list.get(i).getTujuan();
        pnj.addRow(ob);
    }
    jt.setModel(pnj);
    }
    public void create (Pengunjung p){
        list.add(p);
        JOptionPane.showMessageDialog(null, "Data Sudah Disimpan");
    }
    public void update (Pengunjung p){
        for (int i = 0; i <list.size(); i++) {
            if(p.getNomer() == list.get(i).getNomer()){
                list.set(i, p);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void delete (int Nomer){
        for (int i = 0; i < list.size(); i++) {
             if (Nomer == list.get(i).getNomer()){
                 list.remove(i);
             }
             JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
        }
    public void search (JTable jt, int Nomer){
       DefaultTableModel pnj = new DefaultTableModel(null,header);
        for(int i=0; i<list.size(); i++){
            if (Nomer == list.get(i).getNomer()){
             Object[] ob = new Object[4];
        ob[0] = list.get(i).getNomer();
        ob[1] = list.get(i).getNama();
        ob[2] = list.get(i).getKendaraan();
        ob[3] = list.get(i).getTujuan();
        pnj.addRow(ob);   
            }
        
    }
    jt.setModel(pnj); 
    }
    }
