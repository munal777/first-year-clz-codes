
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PetRecordSystem
 {
    private JFrame frame;
    private JTextField catIdArea, catNameArea, catAgeArea, catOwnerArea;
    private JTextField dogIdArea, dogNameArea, dogAgeArea, dogOwnerArea, dogVacciDateArea;
    private JButton catButton, dogButton, displayButton, soundButton;
    private JTextField petIdArea, vaccinationArea, btnTextArea;
    private ArrayList<Animal> animals = new ArrayList<>();
    public PetRecordSystem()
    {
        Border border = BorderFactory.createLineBorder(new Color(235,235,235),25);
        Border textBorderArea = BorderFactory.createLineBorder(Color.BLACK, 2);
        Font lblFont = new Font("sans-serif", Font.PLAIN, 16);
        Font lblHead = new Font("sans-serif", Font.BOLD, 20);
        Font lblTitle = new Font("sans-serif", Font.PLAIN, 18);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(220,220,220));
        mainPanel.setLayout(null);
        mainPanel.setBorder(border);

        JLabel lblHeading = new JLabel("Pet Record System");
        lblHeading.setBounds(450,60,300,25);
        lblHeading.setFont(lblHead);
        mainPanel.add(lblHeading);

        //cat Panel
        JPanel catPanel = new JPanel();
        catPanel.setLayout(null);
        catPanel.setBounds(25, 100, 330, 420);
        catPanel.setBackground(new Color(220,220,220));
        mainPanel.add(catPanel);

        JLabel catHeading = new JLabel("Cat Info");
        catHeading.setBounds(140, 20, 100, 22);
        catHeading.setFont(lblTitle);
        catPanel.add(catHeading);

        JLabel catPetId = new JLabel("Pet Id:");
        catPetId.setBounds(50, 70, 80, 20);
        catPetId.setFont(lblFont);
        catPanel.add(catPetId);

        catIdArea = new JTextField();
        catIdArea.setBounds(150, 70, 130, 24);
        catIdArea.setBorder(textBorderArea);
        catPanel.add(catIdArea);

        JLabel catName = new JLabel("Name:");
        catName.setBounds(50, 120, 100, 22);
        catName.setFont(lblFont);
        catPanel.add(catName);

        catNameArea = new JTextField();
        catNameArea.setBounds(150, 120, 130, 24);
        catNameArea.setBorder(textBorderArea);
        catPanel.add(catNameArea);

        JLabel catAge = new JLabel("Age:");
        catAge.setBounds(50, 170, 100, 22);
        catAge.setFont(lblFont);
        catPanel.add(catAge);

        catAgeArea = new JTextField();
        catAgeArea.setBounds(150, 170, 130, 24);
        catAgeArea.setBorder(textBorderArea);
        catPanel.add(catAgeArea);

        JLabel catOwner = new JLabel("Owner:");
        catOwner.setBounds(50, 220, 100, 22);
        catOwner.setFont(lblFont);
        catPanel.add(catOwner);

        catOwnerArea = new JTextField();
        catOwnerArea.setBounds(150, 220, 130, 24);
        catOwnerArea.setBorder(textBorderArea);
        catPanel.add(catOwnerArea);

        catButton = new JButton("Add Cat");
        catButton.setBounds(90,300,160,35);
        catButton.setBackground(new Color(180,180,180));
        catButton.setFont(lblFont);
        catPanel.add(catButton);

        catButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addCat();
            }
        });

        //dog Panel
        JPanel dogPanel = new JPanel();
        dogPanel.setLayout(null);
        dogPanel.setBounds(370, 100, 330, 420);
        dogPanel.setBackground(new Color(220,220,220));
        mainPanel.add(dogPanel);

        JLabel dogHeading = new JLabel("Dog Info");
        dogHeading.setBounds(140, 20, 100, 22);
        dogHeading.setFont(lblTitle);
        dogPanel.add(dogHeading);

        JLabel dogPetId = new JLabel("Pet Id:");
        dogPetId.setBounds(50, 70, 80, 20);
        dogPetId.setFont(lblFont);
        dogPanel.add(dogPetId);

        dogIdArea = new JTextField();
        dogIdArea.setBounds(150, 70, 130, 24);
        dogIdArea.setBorder(textBorderArea);
        dogPanel.add(dogIdArea);

        JLabel dogName = new JLabel("Name:");
        dogName.setBounds(50, 120, 100, 22);
        dogName.setFont(lblFont);
        dogPanel.add(dogName);

        dogNameArea = new JTextField();
        dogNameArea.setBounds(150, 120, 130, 24);
        dogNameArea.setBorder(textBorderArea);
        dogPanel.add(dogNameArea);

        JLabel dogAge = new JLabel("Age:");
        dogAge.setBounds(50, 170, 100, 22);
        dogAge.setFont(lblFont);
        dogPanel.add(dogAge);

        dogAgeArea = new JTextField();
        dogAgeArea.setBounds(150, 170, 130, 24);
        dogAgeArea.setBorder(textBorderArea);
        dogPanel.add(dogAgeArea);

        JLabel dogOwner = new JLabel("Owner:");
        dogOwner.setBounds(50, 220, 100, 22);
        dogOwner.setFont(lblFont);
        dogPanel.add(dogOwner);

        dogOwnerArea = new JTextField();
        dogOwnerArea.setBounds(150, 220, 130, 24);
        dogOwnerArea.setBorder(textBorderArea);
        dogPanel.add(dogOwnerArea);

        JLabel dogVacciDate = new JLabel("Vaccination Date:");
        dogVacciDate.setBounds(10, 270, 130, 22);
        dogVacciDate.setFont(lblFont);
        dogPanel.add(dogVacciDate);

        dogVacciDateArea = new JTextField();
        dogVacciDateArea.setBounds(150, 270, 130, 24);
        dogVacciDateArea.setBorder(textBorderArea);
        dogPanel.add(dogVacciDateArea);

        dogButton = new JButton("Add Dog");
        dogButton.setBounds(90,350,160,40);
        dogButton.setBackground(new Color(180,180,180));
        dogButton.setFont(lblFont);
        dogPanel.add(dogButton);

        //actionlistener
        dogButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addDog();
            }
        });


        //left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(148,148,148));
        leftPanel.setLayout(null);
        leftPanel.setBounds(750, 200, 310, 220);

        JLabel petId = new JLabel("Pet Id:");
        petId.setBounds(75, 40, 80, 20);
        petId.setFont(lblFont);
        leftPanel.add(petId);

        petIdArea = new JTextField();
        petIdArea.setBounds(160, 40, 130, 24);
        petIdArea.setBorder(textBorderArea);
        leftPanel.add(petIdArea);

        JLabel vaccinationDate = new JLabel("Vaccination Date:");
        vaccinationDate.setBounds(20, 90, 125, 20);
        vaccinationDate.setFont(lblFont);
        leftPanel.add(vaccinationDate);

        vaccinationArea = new JTextField();
        vaccinationArea.setBounds(160, 90, 130, 24);
        vaccinationArea.setBorder(textBorderArea);
        leftPanel.add(vaccinationArea);

        JButton vaccinateDog = new JButton("Vaccinate Dog");
        vaccinateDog.setBounds(90,150,140,40);
        vaccinateDog.setBackground(new Color(200,200,200));
        vaccinateDog.setFont(lblFont);
        leftPanel.add(vaccinateDog);

        //Bottom Panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(140,140,140));
        bottomPanel.setLayout(null);
        bottomPanel.setBounds(80,540,510,180);

        JLabel btnPetId = new JLabel("Pet Id:");
        btnPetId.setBounds(160, 40, 80, 20);
        btnPetId.setFont(lblFont);
        bottomPanel.add(btnPetId);

        btnTextArea = new JTextField();
        btnTextArea.setBounds(240, 40, 140, 24);
        btnTextArea.setBorder(textBorderArea);
        bottomPanel.add(btnTextArea);

        displayButton = new JButton("Display Info");
        displayButton.setBounds(7, 120, 160, 35);
        displayButton.setBackground(Color.LIGHT_GRAY);
        displayButton.setFont(lblFont);
        bottomPanel.add(displayButton);

        soundButton = new JButton("Make Sound");
        soundButton.setBounds(342, 120, 160, 35);
        soundButton.setBackground(Color.LIGHT_GRAY);
        soundButton.setFont(lblFont);
        bottomPanel.add(soundButton);

        frame = new JFrame("Pet System");
        frame.setSize(1100,800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(mainPanel);
        mainPanel.add(leftPanel);
        mainPanel.add(bottomPanel);

    }

    public static void main(String[] args) {
        PetRecordSystem reg = new PetRecordSystem();
    }

    private String getText(JTextField text){
        String textField = text.getText().trim();
        if(textField.isEmpty()) {
            throw new IllegalArgumentException("Empty");
        }
        return textField;
    }

    private boolean checkId(String id)
    {
        for(Animal animal: animals)
        {
            if (animal.getPetId().equals(id))
            {
                return false;
            }
        }
        return true;
    }

    public void addDog() 
    {
        try
        {
            String id = getText(dogIdArea);
            String name = getText(dogNameArea);
            String age = getText(dogAgeArea);
            String owner = getText(dogAgeArea);
            String date = getText(dogVacciDateArea);

            Dog dog = new Dog(id, name, age, owner, date);
            animals.add(dog);

            String dogMessage ="Dog id: "+id+"\nName: "+name+"\nAge: "+age+"\nOwner: "+owner+"\nVaccination Date: "+date;

            if (!checkId(id))
            {
                JOptionPane.showMessageDialog(null,"id already existed","error",JOptionPane.ERROR_MESSAGE);
            }

            // Dog dog = new Dog(id, name, age, owner, date);
            // animals.add(dog);

            // String dogMessage ="Dog id: "+id+"\nName: "+name+"\nAge: "+age+"\nOwner: "+owner+"\nVaccination Date: "+date;
            else {
                JOptionPane.showMessageDialog(null,dogMessage,"dog info",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void addCat()
    {
        try
        {
        String id = getText(catIdArea);
        String name = getText(catNameArea);
        String age = getText(catAgeArea);
        int ageInt = Integer.parseInt(age); //converting string into int
        String owner = getText(catOwnerArea);

        Cat cat = new Cat(id, name, owner, ageInt);
        animals.add(cat);

        String catMessage = "cat Id: "+id+"\nCat Name: "+name+"\nAge: "+ageInt+"\nOwner: "+owner;

        if(!checkId(id))
        {
            JOptionPane.showMessageDialog(null,"id already existed","error",JOptionPane.ERROR_MESSAGE);
        }

        // Cat cat = new Cat(id, name, owner, ageInt);
        // animals.add(cat);

        // String catMessage = "cat Id: "+id+"\nCat Name: "+name+"\nAge: "+ageInt+"\nOwner: "+owner;
        else {
            JOptionPane.showMessageDialog(null,catMessage,"cat info",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
