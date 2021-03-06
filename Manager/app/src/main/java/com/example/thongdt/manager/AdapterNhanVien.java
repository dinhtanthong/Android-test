package com.example.thongdt.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterNhanVien extends BaseAdapter {

    Context context;
    ArrayList<NhanVien> list;

    public AdapterNhanVien(Context context, ArrayList<NhanVien> list) {
        this.context = context;
        this.list = list;
    }

//    TH: it thoi nha ma pa =))
//    tra ve so dong se dc Adapter,
//    Adapter ve ra so dong hien thi cac Nhan Vien Trong list Nhan Vien
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listview_row, null);

        ImageView imgHinhDaiDien = (ImageView) row.findViewById(R.id.imgHinhDaiDien);
        TextView txtId = (TextView) row.findViewById(R.id.txtId);
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtSdt = (TextView) row.findViewById(R.id.txtSdt);
        Button btnSua = (Button) row.findViewById(R.id.btnSua);
        Button btnXoa = (Button) row.findViewById(R.id.btnXoa);

        NhanVien nhanVien = list.get(position);
        txtId.setText(nhanVien.id + "");
        txtTen.setText(nhanVien.ten);
        txtSdt.setText(nhanVien.sdt);

        Bitmap bmHinhDaiDien = BitmapFactory.decodeByteArray(nhanVien.anh, 0, nhanVien.anh.length);
        imgHinhDaiDien.setImageBitmap(bmHinhDaiDien);
        return row;
    }
}
