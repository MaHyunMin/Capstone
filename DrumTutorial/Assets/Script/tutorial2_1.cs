using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class tutorial2_1 : MonoBehaviour {

    float bar_speed;
    bool isPlay, isStop;
    int setnum = 0;

    private GameObject bar;
    private GameObject playBtn;
    private GameObject pauseBtn;
    private GameObject note;
    private GameObject note1;
    private GameObject note2;
    private GameObject note3;

    Vector2 v;

    // Use this for initialization
    void Start()
    {
        if (bar == null)
        {
            bar = GameObject.FindGameObjectWithTag("Bar");
        }

        if (playBtn == null)
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

        if (pauseBtn == null)
        {
            try
            {
                pauseBtn = GameObject.Find("PauseBtn");
            }
            catch (NullReferenceException ex)
            {
                Debug.Log("No name");
            }
        }

        if (note == null)
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

        if (note3 == null)
        {
            note3 = GameObject.FindGameObjectWithTag("Note3");
        }

        v = bar.transform.localPosition;
        v.x = -2.65f;
        isPlay = false;
        isStop = false;
        bar_speed = 0.04f;
    }

    // Update is called once per frame
    void Update()
    {
        if (isPlay == true)
        {
            move();
        }

        if (isStop == true)
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
        if (isPlay == true)
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
            setnum = 1;
        }

        if (other.tag == "Block1")
        {
            note1.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 0 / 255f, 0 / 255f);
            pauseBtn.GetComponent<Button>().onClick.Invoke();
            isStop = true;
            setnum = 2;
        }

        if (other.tag == "Block2")
        {
            note2.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 0 / 255f, 0 / 255f);
            pauseBtn.GetComponent<Button>().onClick.Invoke();
            isStop = true;
            setnum = 3;
        }

        if (other.tag == "Block3")
        {
            note3.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 0 / 255f, 0 / 255f);
            pauseBtn.GetComponent<Button>().onClick.Invoke();
            isStop = true;
            setnum = 4;
        }
    }

    public void OnTriggerExit(Collider other)
    {
        if (other.tag == "Block")
        {
            note.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
        }

        if (other.tag == "Block1")
        {
            note1.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
        }

        if (other.tag == "Block2")
        {
            note2.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
        }

        if (other.tag == "Block3")
        {
            note3.GetComponent<SpriteRenderer>().material.color = new Color(255 / 255f, 255 / 255f, 255 / 255f);
        }
    }
}
