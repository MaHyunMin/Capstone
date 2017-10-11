using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class sound : MonoBehaviour {

    public SpriteRenderer sr;
    public Sprite curr;
    public Sprite next;
    public AudioClip audioclip;

    private Touch touch;
    private Vector3 pos;

    private GameObject snareBtn;

    public static int clicknum = 10;

    // Use this for initialization
    void Start () {
        if (snareBtn == null)
        {
            try
            {
                snareBtn = GameObject.Find("SnareBtn");
            }
            catch (NullReferenceException ex)
            {
                Debug.Log("No name");
            }
        }
    }
	
	// Update is called once per frame
	void Update () {
        
    }

    public void OnMouseDown()
    {
        if (this.gameObject.name == "bassBtn" || this.gameObject.name == "crashBtn")
        {
            clicknum = 1;
        }
        else if (this.gameObject.name == "floorBtn" || this.gameObject.name == "hihat1Btn")
        {
            clicknum = 2;
        }
        else if (this.gameObject.name == "snareBtn" || this.gameObject.name == "hihat2Btn")
        {
            clicknum = 3;
        }
        else if (this.gameObject.name == "tom1Btn" || this.gameObject.name == "rideBtn")
        {
            clicknum = 4;
        }
        else if (this.gameObject.name == "tom2Btn")
        {
            clicknum = 5;
        }
        GetComponent<AudioSource>().clip = audioclip;
        GetComponent<AudioSource>().PlayOneShot(audioclip);
        sr.sprite = next;
    }

    public void OnMouseUp()
    {
        sr.sprite = curr;
    }

    public void OnMouseDrag()
    {
        sr.sprite = next;
    }
}
