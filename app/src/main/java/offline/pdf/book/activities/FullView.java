package offline.pdf.book.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import offline.pdf.book.R;

public class FullView extends AppCompatActivity {

    String fileName;
    Intent intent;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);


        pdfView = (PDFView) findViewById(R.id.pdfView);
        intent = getIntent();

        if(intent != null) {
            fileName = intent.getStringExtra("fileName");
            if(fileName != null){
                pdfView.fromAsset(fileName+".pdf").load();
            }else {
                toastErro("Ocoreu uma falha");
                finish();
            }
        }else {
            toastErro("Ocoreu uma falha");
            finish();
        }


    }

    private void toastErro(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
