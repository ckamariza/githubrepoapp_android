package com.githubrepos.application.ui.detail;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.githubrepos.application.R;
import com.githubrepos.application.base.BaseFragment;
import com.githubrepos.application.ui.main.MainActivity;
import com.githubrepos.application.util.ViewModelFactory;

import javax.inject.Inject;

import butterknife.BindView;

public class DetailsFragment extends BaseFragment {


    @BindView(R.id.tv_label_repo_name)
    AppCompatTextView repolblNameTextView;
    @BindView(R.id.tv_label_repo_description)
    AppCompatTextView repolblDescriptionTextView;
    @BindView(R.id.tv_label_repo_createddate)
    AppCompatTextView repolblCreatedDateTextView;
    @BindView(R.id.tv_label_repo_lastupdated)
    AppCompatTextView repolblLastupdateTextView;
    @BindView(R.id.tv_label_repo_repolink)
    AppCompatTextView repolblRepolinkTextView;
    @BindView(R.id.tv_label_repo_licenceinfo)
    AppCompatTextView repolblLicenceTextView;

    @BindView(R.id.tv_repo_name)
    AppCompatTextView repoNameTextView;
    @BindView(R.id.tv_repo_description)
    AppCompatTextView repoDescriptionTextView;
    @BindView(R.id.tv_repo_createddate)
    AppCompatTextView repoCreatedDateTextView;
    @BindView(R.id.tv_repo_lastupdated)
    AppCompatTextView repoLastupdateTextView;
    @BindView(R.id.tv_repo_repolink)
    AppCompatTextView repoRepolinkTextView;
    @BindView(R.id.tv_repo_licenceinfo)
    AppCompatTextView repoLicenceTextView;

    @Inject
    ViewModelFactory viewModelFactory;
    private DetailsViewModel detailsViewModel;

    @Override
    protected int layoutRes() {
        return R.layout.screen_details;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(R.string.repos_details_view);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);

        detailsViewModel = ViewModelProviders.of(getBaseActivity(), viewModelFactory).get(DetailsViewModel.class);
        detailsViewModel.restoreFromBundle(savedInstanceState);
        displayRepo();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        detailsViewModel.saveToBundle(outState);
    }

    private void displayRepo() {

        repolblNameTextView.setText(R.string.repo_name);
        repolblDescriptionTextView.setText(R.string.repos_desc);
        repolblCreatedDateTextView.setText(R.string.created_date);
        repolblLastupdateTextView.setText(R.string.last_updated);
        repolblRepolinkTextView.setText(R.string.link_to_repos);
        repolblLicenceTextView.setText(R.string.license_info);

        detailsViewModel.getSelectedRepo().observe(this, repo -> {
            if (repo != null) {

                repoNameTextView.setText(repo.name);
                repoDescriptionTextView.setText(repo.description);
                repoCreatedDateTextView.setText(String.valueOf(repo.created_at));
                repoLastupdateTextView.setText(String.valueOf(repo.pushed_at));
                repoRepolinkTextView.setText(String.valueOf(repo.url));
                if (repo.license != null) {
                    repoLicenceTextView.setText(String.valueOf(repo.license.name));
                } else {
                    repoLicenceTextView.setText("");
                }

            }
        });
    }


}
