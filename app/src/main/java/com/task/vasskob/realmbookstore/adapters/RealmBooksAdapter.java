package com.task.vasskob.realmbookstore.adapters;

import android.content.Context;

import com.task.vasskob.realmbookstore.model.Book;

import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}