package me.san.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.san.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {



    public SobreFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "A ATM Consultoria tem como missão apoiar organizações" +
                " que desejam alcançar o suceso através da excelência em gestão e da busca pela qualidade.";
        return new AboutPage(getActivity())
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com", "Acesse nosso site")
                .addGroup("Redes  Sociais")
                .addFacebook("santiago.silvestre.92", "Facebook")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addGitHub("SantiagoSilvestre", "GitHub")
                .addInstagram("santiago.silvestre.92", "Instagram")
                .addItem(new Element().setTitle("Versão 1.0"))
                .create();
        //return inflater.inflate(R.layout.fragment_sobre, container, false);

    }
}