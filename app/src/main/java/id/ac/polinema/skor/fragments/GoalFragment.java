package id.ac.polinema.skor.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import id.ac.polinema.skor.R;
import id.ac.polinema.skor.databinding.FragmentGoalBinding;
import id.ac.polinema.skor.models.GoalScorer;

/**
 * A simple {@link Fragment} subclass.
 */
public class GoalFragment extends Fragment {

	private String requestKey;
	private GoalScorer goalScorer;

	public GoalFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.goalScorer = new GoalScorer();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		FragmentGoalBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_goal, container, false);

		requestKey = GoalFragmentArgs.fromBundle(getArguments()).getRequestKey();
		return binding.getRoot();
	}

	public void onSaveClicked(View view) {

	}

	public void onCancelClicked(View view) {
		Navigation.findNavController(view).navigate(R.id.action_goalFragment_to_scoreFragment);
	}
}