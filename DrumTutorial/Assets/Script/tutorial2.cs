using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class tutorial2 : MonoBehaviour {

    float bar_speed = 0.05f;
    bool isPlay;
    private GameObject bar;
    private GameObject playBtn;
    Vector2 v;

	// Use this for initialization
	void Start () {
        if(bar == null)
        {
            bar = GameObject.FindGameObjectWithTag("Bar");
        }
        
        if(playBtn == null)
        {
            playBtn = GameObject.FindGameObjectWithTag("PlayBtn");
        }
        v = bar.transform.localPosition;
        v.x = -2.65f;
        isPlay = false;
    }
	
	// Update is called once per frame
	void Update () {
        if(isPlay == true)
        {
            if (bar.transform.localPosition.x < 2.65)
            {
                bar.transform.Translate(bar_speed, 0, 0);
            }
            else
            {
                bar.transform.position = v;
            }
        }
    }

    public void backScene()
    {
        SceneManager.LoadScene("Menu");
    }

    public void click()
    {
        isPlay = true;
    }

    public void click2()
    {
        isPlay = false;
    }
}
