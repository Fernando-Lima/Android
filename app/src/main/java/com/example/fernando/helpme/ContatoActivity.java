package com.example.fernando.helpme;


import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

public class ContatoActivity extends DebugActivity {
    private static final String TAG = "teste";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
        printContatos();
    }

    private void printContatos() {
        Uri contatos = ContactsContract.Contacts.CONTENT_URI;
        Cursor cursor = getContentResolver().query(contatos, null, ContactsContract.Contacts.HAS_PHONE_NUMBER + " = 1", null, null);
        int count = cursor.getCount();
        Log.i(TAG, "Foram encontrados" + count + "contatos");
        while (cursor.moveToNext()) {
            String nome = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
            Log.i(TAG, "Nome: " + nome);
        }
        cursor.close();
    }
}
