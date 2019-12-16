package com.example.calender;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
public class  cm extends AppCompatActivity {
    Calendar c = Calendar.getInstance();
   final int day = c.get(Calendar.DAY_OF_MONTH);
   final int month = c.get(Calendar.MONTH);
    String []months = {"जानेवारी","फेब्रुवारी","मार्च","एप्रिल","मे","जून","जुलै","ऑगस्ट","सप्टेंबर","ऑक्टोबर","नोव्हेंबर","डिसेंबर"};
    String []days = {"१","२","३","४","५","६","७","८","९","१०","११","१२","१३","१४","१५","१६","१७","१८","१९","२०","२१","२२","२३","२४","२५","२६","२७","२८","२९","३०","३१"};
    TextView monthname,completedate,extrainfo;
    TextView []t = new TextView[35];
    ImageButton i1,i2;
    int mo = month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_main);
        monthname=findViewById(R.id.monthname);
        completedate=findViewById(R.id.complete_date);
        extrainfo=findViewById(R.id.extrainfo);
        t[0]=findViewById(R.id.daysr1c1);
        t[1]=findViewById(R.id.daysr1c2);
        t[2]=findViewById(R.id.daysr1c3);
        t[3]=findViewById(R.id.daysr1c4);
        t[4]=findViewById(R.id.daysr1c5);
        t[5]=findViewById(R.id.daysr1c6);
        t[6]=findViewById(R.id.daysr1c7);
        t[7]=findViewById(R.id.daysr2c1);
        t[8]=findViewById(R.id.daysr2c2);
        t[9]=findViewById(R.id.daysr2c3);
        t[10]=findViewById(R.id.daysr2c4);
        t[11]=findViewById(R.id.daysr2c5);
        t[12]=findViewById(R.id.daysr2c6);
        t[13]=findViewById(R.id.daysr2c7);
        t[14]=findViewById(R.id.daysr3c1);
        t[15]=findViewById(R.id.daysr3c2);
        t[16]=findViewById(R.id.daysr3c3);
        t[17]=findViewById(R.id.daysr3c4);
        t[18]=findViewById(R.id.daysr3c5);
        t[19]=findViewById(R.id.daysr3c6);
        t[20]=findViewById(R.id.daysr3c7);
        t[21]=findViewById(R.id.daysr4c1);
        t[22]=findViewById(R.id.daysr4c2);
        t[23]=findViewById(R.id.daysr4c3);
        t[24]=findViewById(R.id.daysr4c4);
        t[25]=findViewById(R.id.daysr4c5);
        t[26]=findViewById(R.id.daysr4c6);
        t[27]=findViewById(R.id.daysr4c7);
        t[28]=findViewById(R.id.daysr5c1);
        t[29]=findViewById(R.id.daysr5c2);
        t[30]=findViewById(R.id.daysr5c3);
        t[31]=findViewById(R.id.daysr5c4);
        t[32]=findViewById(R.id.daysr5c5);
        t[33]=findViewById(R.id.daysr5c6);
        t[34]=findViewById(R.id.daysr5c7);
        i1=findViewById(R.id.calender_back_button);
        i2=findViewById(R.id.calender_forward_button);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monthpre();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monthfor();
            }
        });
        setcompletedate();
        setcalender(month);
        setmonname(month);

    }
    public  void setmonname(int mo)
    {
        monthname.setText(months[mo]);
    }
    public void setcompletedate()
    {
        String c = days[day] + "  " +months[month]+ "  "+"२०२०";
        completedate.setText(c);
    }
    public void monthpre()
    {

       if(mo!=0)
       {
           mo-=1;
           setcalender(mo);
       }

    }
    public void monthfor()
    {
        if(mo!=11)
        {
            mo+=1;
            setcalender(mo);
        }
    }
    public void setcalender(int mo)
    { int mon =mo;
        switch (mon)
        {
            case 0:
                jan();
                break;
            case 1:
                feb();
                break;
            case 2:
                mar();
                break;
            case 3:
                apr();
                break;
            case 4:
                may();
                break;
            case 5:
                jun();
                break;
            case 6:
                jul();
                break;
            case 7:
                aug();
                break;
            case 8:
                sep();
                break;
            case 9: 
                oct();
                break;
            case 10:
                nov();
                break;
            case 11:
                dec();
                break;
        }
    }

    private void oct() {removebgc();
        int start=4,y=0,m=9;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[16].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[4].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[34].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[30].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[19].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[5].setTextColor(getResources().getColor(R.color.sunday1));
        t[33].setTextColor(getResources().getColor(R.color.sunday1));
        t[28].setTextColor(getResources().getColor(R.color.sunday1));


        String s ="१ - पौर्णिमा\n२ - महात्मा गांधी जयंती\n१३ - एकादशी\n१६ -  अमावस्या\n२५ - दसरा\n२७ - एकादशी\n३० - ईद-ए-मिलाद\n३१ - पौर्णिमा";
        extrafill(s);
    }

    private void sep() {
        removebgc();
        int start=2,y=0,m=8;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=30)
                    break;
            }
        }
        t[14].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[3].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[28].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[18].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[2].setBackgroundColor(getResources().getColor(R.color.others));


        String s = "१ - अनंत चतुर्दशी\n२ - पौर्णिमा\n१६ - एकादशी\n१७ - अमावस्या\n२७ - एकादशी";
        extrafill(s);
    }

    private void aug() {
        removebgc();
        int start=6,y=0,m=7;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[0].setText(days[29]);
        t[1].setText(days[30]);

        t[6].setTextColor(getResources().getColor(R.color.sunday1));
        t[8].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[16].setBackgroundColor(getResources().getColor(R.color.others));
        t[20].setTextColor(getResources().getColor(R.color.sunday1));
        t[21].setTextColor(getResources().getColor(R.color.sunday1));
        t[27].setBackgroundColor(getResources().getColor(R.color.others));
        t[34].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[24].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[0].setTextColor(getResources().getColor(R.color.sunday1));


        String s = "१ - बकरा ईद\n३ - पौर्णिमा\n११ - कृष्ण जन्माष्टमी\n१५ - स्वातंत्र्यदिन\n१६ - पारसी नवीन वर्ष\n१९ - अमावस्या\n२२ - श्रीगणेश चतुर्थी\n२९ - एकादशी\n३० - मोहरम";
        extrafill(s);
    }

    private void jul() {
        removebgc();
        int start=3,y=0,m=6;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[3].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[7].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[18].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[22].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[23].setBackgroundColor(getResources().getColor(R.color.others));
        t[32].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        String s = "१ - एकादशी\n५ - गुरु पौर्णिमा\n१६ - एकादशी\n२० - अमावस्या\n२१ - श्रावण मासारंभ\n३० - एकादशी";
        extrafill(s);
    }

    private void jun() {
        removebgc();
        int start = 1, y = 0, m = 5;
        setmonname(m);
        for (int i = 0; i < 35; i++) {
            if (i >= start) {
                if (m == month && i == day + start) {
                    t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
                }
                t[i].setText(days[y]);
                y++;
                if (y >= 30)
                    break;
            }
        }
        t[2].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[6].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[17].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[21].setBackgroundColor(getResources().getColor(R.color.amavas));
        String s = "२ - एकादशी\n५ - पौर्णिमा\n१७ - एकादशी\n२१ - अमावस्या";
        extrafill(s);
    }

    private void may() {
        removebgc();
        int start=5,y=0,m=4;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[0].setText(days[30]);
        t[8].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[11].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[22].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[26].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[5].setTextColor(getResources().getColor(R.color.sunday1));
        t[11].setTextColor(getResources().getColor(R.color.sunday1));
        t[28].setTextColor(getResources().getColor(R.color.sunday1));
        String s = "१ - महाराष्ट्र दिन\n४ - एकादशी\n७ - बुद्ध पूर्णिमा\n१८ - एकादशी\n२२ - अमावस्या\n२५ - रमझान ईद";
        extrafill(s);
    }

    private void apr() {
        removebgc();
        int start=3,y=0,m=3;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=30)
                    break;
            }
        }
        t[6].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[10].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[20].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[24].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[4].setTextColor(getResources().getColor(R.color.sunday1));
        t[8].setTextColor(getResources().getColor(R.color.sunday1));
        t[12].setTextColor(getResources().getColor(R.color.sunday1));
        t[16].setTextColor(getResources().getColor(R.color.sunday1));
        String s = "२ - राम नवमी\n४ - एकादशी\n६ - महावीर जयंती\n८ - पौर्णिमा\n१० - गुड फ्रायडे\n१४ - डॉ. आंबेडकर जयंती\n१८ - एकादशी\n२२ - अमावस्या";
        extrafill(s);


    }

    private void mar() {
        removebgc();
        int start=0,y=0,m=2;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[5].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[8].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[19].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[23].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[9].setTextColor(getResources().getColor(R.color.sunday1));
        t[25].setTextColor(getResources().getColor(R.color.sunday1));
        String s = "६ - एकादशी\n९ - होळी, पौर्णिमा\n१० - धूलिवंदन\n२०- एकादशी\n२४ - अमावस्या\n२५ - गुढी पाडवा";
        extrafill(s);
    }

    private void feb() {
        removebgc();
        int start=6,y=0,m=1;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=29)
                    break;
            }
        }
        t[10].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[14].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[24].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[28].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[17].setTextColor(getResources().getColor(R.color.sunday1));
        t[26].setTextColor(getResources().getColor(R.color.sunday1));
        String s = "५ - एकादशी\n९ - पौर्णिमा\n१९ - छत्रपती शिवाजी महाराज जयंती, एकादशी\n२१ - महाशिवरात्रि\n२३ - अमावस्या";
        extrafill(s);
    }

    private void nov() {
        removebgc();
        int start=0,y=0,m=10;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=30)
                    break;
            }
        }

        t[10].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[29].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[25].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[14].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[13].setBackgroundColor(getResources().getColor(R.color.others));
        t[15].setBackgroundColor(getResources().getColor(R.color.others));
        t[13].setTextColor(getResources().getColor(R.color.sunday1));
        t[29].setTextColor(getResources().getColor(R.color.sunday1));
        t[15].setTextColor(getResources().getColor(R.color.sunday1));
        String s = "११ - एकादशी\n१४ - लक्ष्मीपूजन\n१५ - अमावस्या\n१६ - दिवाळी\n२६ - एकादशी\n३० - गुरु नानक जयंती, पौर्णिमा";
        extrafill(s);
    }

    private void dec() {
        removebgc();
        int start=2,y=0,m=11;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[12].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[31].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[26].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[15].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[26].setTextColor(getResources().getColor(R.color.sunday1));
        String s ="११ - एकादशी\n१४ - अमावस्या\n२५ - ख्रिसमस, एकादशी\n३० - पौर्णिमा";
        extrafill(s);
    }

    public void jan()
    {
        removebgc();
        int start=3,y=0,m=0;
        setmonname(m);
        for (int i = 0 ; i < 35 ; i++)
        {
            if(i>=start)
            {   if(m==month&&i==day+start)
            {
                t[i].setBackgroundColor(getResources().getColor(R.color.currentday));
            }
                t[i].setText(days[y]);
                y++;
                if(y>=31)
                    break;
            }
        }
        t[8].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[12].setBackgroundColor(getResources().getColor(R.color.purnima));
        t[22].setBackgroundColor(getResources().getColor(R.color.ekadashi));
        t[26].setBackgroundColor(getResources().getColor(R.color.amavas));
        t[28].setTextColor(getResources().getColor(R.color.sunday1));
        String s ="६ - एकादशी\n१० - पौर्णिमा\n२० - एकादशी\n२४ - अमावस्या\n२६ - गुणराज्य दिवस";
        extrafill(s);


    }
    void removebgc()
    {
        for (int i = 0 ; i < 35 ; i++)
        {
            t[i].setBackgroundColor(0);
            t[i].setText(null);
           // t[i].setTextColor(getResources().getColor(R.color.Black));
        }
    }

    void extrafill(String s)
    {
        extrainfo.setText(s);
        extrainfo.setMovementMethod(new ScrollingMovementMethod());
    }
}
