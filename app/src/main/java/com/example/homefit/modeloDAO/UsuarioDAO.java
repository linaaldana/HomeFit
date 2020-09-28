package com.example.homefit.modeloDAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.homefit.ConexionSQLiteHelper;
import com.example.homefit.entidades.Usuario;
import com.example.homefit.utilidades.Utilidades;

public class UsuarioDAO {
    ConexionSQLiteHelper conexionSQLiteHelper;
    SQLiteDatabase db;

    public void UsuarioDAO(Context context){
        conexionSQLiteHelper=new ConexionSQLiteHelper(context);
    }

    public long insertarUsuario(Usuario usuario){
        ContentValues registro= new ContentValues();
        registro.put(Utilidades.tablaUsuarios.CAMPO_ID,usuario.getId());

        return 0;
    }
}
