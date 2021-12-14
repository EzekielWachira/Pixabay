package com.karis.adalabs_pixabayapi.ui.fragments.detailFragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.karis.adalabs_pixabayapi.commons.loadImage
import com.karis.adalabs_pixabayapi.data.network.responses.HitsItem
import com.karis.adalabs_pixabayapi.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding
    private lateinit var imageItem : HitsItem

    private val args by navArgs<DetailFragmentArgs>()


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater,container,false)
        imageItem = args.imageItem

        binding.apply {

            //load image
            imageViewImage.loadImage(imageItem.largeImageURL)
            //bind tags
            textViewTags.text = "Tags : ${imageItem.tags}"
            //Bind Views
            textViewNumViews.text = "${imageItem.views} views"
            //Bind likes
            textViewNumlikes.text = "${imageItem.likes} likes"
            //Bind downloads
            textViewNumdownloads.text = "${imageItem.downloads} downloads"
            //Bind Comments
            textViewNumcomments.text = "${imageItem.comments} comments"
            //Bind User image
            imageViewImageUser.loadImage(imageItem.userImageURL)
            //bind page Url
            textViewPageurl.text = "Page Url: ${imageItem.pageURL}"
        }

        return binding.root
    }



}