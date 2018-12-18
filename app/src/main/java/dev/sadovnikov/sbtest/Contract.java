package dev.sadovnikov.sbtest;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface Contract {

    interface MainView extends MvpView {
        void showTranslatorView();
    }

    interface MainPresenter extends MvpPresenter<MainView> {

    }

    interface TranslatorView extends MvpView {

    }

    interface TranslatorPresenter extends MvpPresenter<TranslatorView> {

    }


}
