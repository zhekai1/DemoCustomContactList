package sg.edu.rp.c346.id21024750.democustomcontactlist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView ivMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();

        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactList.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);

        ivMain = findViewById(R.id.ivMain);
        String imageUrl = "https://seeklogo.com/images/A/android-logo-E109D453E3-seeklogo.com.png";
        Picasso.with(this).load(imageUrl).into(ivMain);

    }
}