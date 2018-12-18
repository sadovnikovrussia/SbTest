package dev.sadovnikov.sbtest;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

public class MainPresenter extends MvpBasePresenter<Contract.MainView> {

    public MainPresenter() {
        super();
    }

    @Override
    public void attachView(Contract.MainView view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
