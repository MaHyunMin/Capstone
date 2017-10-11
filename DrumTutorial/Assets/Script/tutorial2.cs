using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class tutorial2 : MonoBehaviour {

    float bar_speed;
    bool isPlay, isStop;

    private GameObject bar;
    private GameObject playBtn;
    private GameObject pauseBtn;
    private GameObject note;
    private GameObject note1;
    private GameObject note2;

    Vector2 v;
    Vector3 v3_1;
    Vector3 v3_2;
    float[] y1 = new float[2] { 2.1f, 1.6f };
    float[] y2 = new float[2] { 3.0f, 2.75f };

    int i = 0, j = 0;
    int setnum = 0;
    int setv3_1 = 0;
    int setv3_2 = 0;

    // Use this for initialization
    void Start () {
        if(bar == null)
        {
            bar = GameObject.FindGameObjectWithTag("Bar");
        }
        
        if(playBtn == null)
        {
            try
            {
                playBtn = GameObject.Find("PlayBtn");
            }
            catch (NullReferenceException ex)
            {
                Debug.Log("No name");
            }
        }

        if(pauseBtn == null)
        {
            try
            {
                pauseBtn = GameObject.Find("PauseBtn");
            }
            catch(NullReferenceException ex)
            {
                Debug.Log("No name");
            }
        }

        if(note == null)
        {
            note = GameObject.FindGameObjectWithTag("Note");
        }

        if (note1 == null)
        {
            note1 = GameObject.FindGameObjectWithTag("Note1");
        }

        if (note2 == null)
        {
            note2 = GameObject.FindGameObjectWithTag("Note2");
        }

        v = bar.transform.localPosition;
        v.x = -2.65f;
        isPlay = false;
        isStop = false;
        bar_speed = 0.04f;

        v3_1 = note1.transform.localPosition;
        v3_1.x = 0;
        v3_1.y = y1[0];
        v3_1.z = -1;

        v3_2 = note2.transform.localPosition;
        v3_2.x = 1.8f;
        v3_2.y = y2[0];
        v3_2.z = -1;
    }
	
	// Update is called once per frame
	void Update () {
        if (isPlay == true)
        {
            move();
        }

        if(isStop == true)
        {
            if (setnum == sound.clicknum)
            {
                playBtn.GetComponent<Button>().onClick.Invoke();
                setnum = 0;
                sound.clicknum = 10;
            }
        }
    }

    public void move()
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

    public void backScene()
    {
        SceneManager.LoadScene("Menu");
    }

    public void click()
    {
        if(isPlay == true)
        {
            bar.transform.position = v;
        }
        else
        {
            isPlay = true;
        }
    }

    public void click2()
    {
        isPlay = false;
    }

    public void OnTriggerEnter(Collider other)
    {
        if (other.tag == "Block")
        {
            note.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 0 / 255f, 0 / 255f);
            pauseBtn.GetComponent<Button>().onClick.Invoke();
            isStop = true;
            setnum = 3;
        }

        if (other.tag == "Block1")
        {
            note1.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 0 / 255f, 0 / 255f);
            pauseBtn.GetComponent<Button>().onClick.Invoke();
            isStop = true;

            if(setv3_1 == 0)
            {
                setnum = 2;
                setv3_1++;
            }
            else
            {
                setnum = 1;
                setv3_1--;
            }
        }

        if (other.tag == "Block2")
        {
            note2.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 0 / 255f, 0 / 255f);
            pauseBtn.GetComponent<Button>().onClick.Invoke();
            isStop = true;

            if (setv3_2 == 0)
            {
                setnum = 4;
                setv3_2++;
            }
            else
            {
                setnum = 5;
                setv3_2--;
            }
        }

    }

    public void OnTriggerExit(Collider other)
    {
        if(other.tag == "Block")
        {
            note.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
        }

        if (other.tag == "Block1")
        {
            if(i == 1)
            {
                note1.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
                v3_1.y = y1[--i];
                note1.transform.position = v3_1;
            }
            else
            {
                note1.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
                v3_1.y = y1[++i];
                note1.transform.position = v3_1;
            }
        }

        if (other.tag == "Block2")
        {
            if (j == 1)
            {
                note2.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
                v3_2.y = y2[--j];
                note2.transform.position = v3_2;
            }
            else
            {
                note2.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
                v3_2.y = y2[++j];
                note2.transform.position = v3_2;
            }
        }
    }
}
