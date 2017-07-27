package tw.org.iii.lotto;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ActMain extends AppCompatActivity {

    String[] strLottos;

    private DialogInterface.OnClickListener btnDialogLotto496_click=new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface dialog, int which) {
            txt_496.setText(strLottos[which]);
        }
    };

    private DialogInterface.OnClickListener btnDialogLotto539_click=new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface dialog, int which) {
            txt_539.setText(strLottos[which]);
        }
    };

    private DialogInterface.OnClickListener btnDialogLotto638_click=new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface dialog, int which) {
            txt_638.setText(strLottos[which]);
        }
    };

    private View.OnClickListener btn496_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            strLottos=(new CLottoGen()).GetLottos(496);

            AlertDialog.Builder build=new AlertDialog.Builder(ActMain.this);
            build.setTitle("請選擇喜歡的組合");
            build.setItems(strLottos, btnDialogLotto496_click);

            Dialog dlg=build.create();
            dlg.show();
        }
    };

    private View.OnClickListener btn539_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            strLottos=(new CLottoGen()).GetLottos(539);

            AlertDialog.Builder build=new AlertDialog.Builder(ActMain.this);
            build.setTitle("請選擇喜歡的組合");
            build.setItems(strLottos, btnDialogLotto539_click);

            Dialog dlg=build.create();
            dlg.show();
        }
    };

    private View.OnClickListener btn638_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            strLottos=(new CLottoGen()).GetLottos(638);

            AlertDialog.Builder build=new AlertDialog.Builder(ActMain.this);
            build.setTitle("請選擇喜歡的組合");
            build.setItems(strLottos, btnDialogLotto638_click);

            Dialog dlg=build.create();
            dlg.show();
        }
    };

    private View.OnClickListener btnclean_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            txt_496.setText("目前沒有號碼");
            txt_539.setText("目前沒有號碼");
            txt_638.setText("目前沒有號碼");
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        btn496=(Button)findViewById(R.id.btn_496);
        btn496.setOnClickListener(btn496_click);
        btn539=(Button)findViewById(R.id.btn_539);
        btn539.setOnClickListener(btn539_click);
        btn638=(Button)findViewById(R.id.btn_638);
        btn638.setOnClickListener(btn638_click);
        btnclean=(Button)findViewById(R.id.btn_Clean);
        btnclean.setOnClickListener(btnclean_click);
        txt_496=(TextView)findViewById(R.id.txt_Num496);
        txt_539=(TextView)findViewById(R.id.txt_Num539);
        txt_638=(TextView)findViewById(R.id.txt_Num638);
    }

    Button btn496,btn539,btn638,btnclean;

    TextView txt_496,txt_539,txt_638;

}
