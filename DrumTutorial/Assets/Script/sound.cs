using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class sound : MonoBehaviour {

    public SpriteRenderer sr;
    public Sprite curr;
    public Sprite next;
    public AudioClip audio;

    private Touch touch;
    private Vector3 pos;

    // Use this for initialization
    void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        /*
        if(Input.touchCount > 0)
        {
            for(int i = 0; i < Input.touchCount; i++)
            {
                touch = Input.GetTouch(i);
                if(touch.phase == TouchPhase.Began)
                {
                    pos = Camera.main.ScreenToWorldPoint(touch.position);
                    GetComponent<AudioSource>().clip = audio;
                    GetComponent<AudioSource>().PlayOneShot(audio);
                    sr.sprite = next;
                    break;
                }
                else if (Input.GetTouch(i).phase == TouchPhase.Moved)
                {
                    sr.sprite = next;
                }
                else if (Input.GetTouch(i).phase == TouchPhase.Canceled)
                {
                    sr.sprite = curr;
                }
                else if (Input.GetTouch(i).phase == TouchPhase.Ended)
                {
                    sr.sprite = curr;
                }
            }
        }
        */
    }

    public void OnMouseDown()
    {
        GetComponent<AudioSource>().clip = audio;
        GetComponent<AudioSource>().PlayOneShot(audio);
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
