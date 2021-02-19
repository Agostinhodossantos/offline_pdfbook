package offline.pdf.book.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

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
        fileName = intent.getStringExtra("fileName");

        pdfView.fromAsset(fileName+".pdf").load();

    }
}
