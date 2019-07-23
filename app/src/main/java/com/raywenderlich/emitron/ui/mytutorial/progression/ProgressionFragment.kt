package com.raywenderlich.emitron.ui.mytutorial.progression

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.raywenderlich.emitron.R
import com.raywenderlich.emitron.di.modules.viewmodel.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class ProgressionFragment : DaggerFragment() {


  @Inject
  lateinit var viewModelFactory: ViewModelFactory

  private val viewModel: ProgressionViewModel by viewModels { viewModelFactory }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_my_tutorials_host, container, false)
  }
}
