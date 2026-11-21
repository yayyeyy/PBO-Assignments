
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiPilihLagu {
    public static void main(String[] args) {

        // Top Level Container
        JFrame frame = new JFrame("Aplikasi Pilih Lagu");
        frame.setSize(500, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout pertama
        frame.setLayout(new BorderLayout(10, 10));

        // Intermediate Container
        JPanel panel = new JPanel();

        // Layout kedua
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Atomic Components
        JLabel judul = new JLabel("Aplikasi Pilih Lagu");
        JLabel labelArtis = new JLabel("Pilih Artis:");

        String[] daftarArtis = {
            "Taylor Swift",
            "Bruno Mars",
            "Ariana Grande",
            "The Weeknd",
            "NIKI"
        };

        JComboBox<String> pilihanArtis =
            new JComboBox<>(daftarArtis);

        JLabel labelLagu = new JLabel("Judul Lagu:");
        JTextField inputLagu = new JTextField(15);

        JButton tombol = new JButton("Pilih Lagu");
        JLabel hasil = new JLabel("Belum ada lagu dipilih.");

        // Event Listener
        tombol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String artis =
                    (String) pilihanArtis.getSelectedItem();

                String lagu = inputLagu.getText();

                if (lagu.isEmpty()) {
                    hasil.setText("Masukkan judul lagu dulu!");
                } else {
                    hasil.setText("Pilihan: " + artis + " - " + lagu);
                }
            }
        });

        // Menambahkan komponen ke panel
        panel.add(labelArtis);
        panel.add(pilihanArtis);
        panel.add(labelLagu);
        panel.add(inputLagu);
        panel.add(tombol);
        panel.add(hasil);

        // Menambahkan komponen ke frame
        frame.add(judul, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Menampilkan frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
