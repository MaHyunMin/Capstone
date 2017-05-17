using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Sound : MonoBehaviour {

    public SpriteRenderer sr;
    public Sprite curr;
    public Sprite next;
    public AudioClip audio;

    Touch touch;
    int i = 0;
    int t_Count;
    
    void Update()
    {
        // Debug.Log("update");
        if (Input.touchCount > 0)
        {
            Debug.Log("touch");
            t_Count = Input.touchCount;

            for (i = 0; i < t_Count; i++)
            {
                Vector2 pos = Input.GetTouch(i).position;
                Vector3 touch = new Vector3(pos.x, pos.y, -3.0f);

                Ray ray = Camera.main.ScreenPointToRay(touch);
                RaycastHit hit;

                if (Physics.Raycast(ray, out hit, Mathf.Infinity))
                {
                    if (Input.GetTouch(i).phase == TouchPhase.Began)
                    {
                        GetComponent<AudioSource>().clip = audio;
                        GetComponent<AudioSource>().PlayOneShot(audio);
                        sr.sprite = next;
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
        }
    }

    /*
    void button_sound()
    {
        // 버튼을 하나 이상 눌렀다면
        if (Input.touchCount > 0)
        {
            Debug.Log("Click buttons");
            // 버튼을 터치한 수 만큼
            for(i = 0; i < Input.touchCount; i++)
            {
                touch = Input.GetTouch(i);
                Debug.Log("2");
                if (touch.phase == TouchPhase.Began)
                {
                    Debug.Log("3");
                    GetComponent<AudioSource>().clip = audio;
                    GetComponent<AudioSource>().PlayOneShot(audio);
                }
            }
        }
    }
    
    void OnMouseDown()
    {
        Debug.Log("Down");
        GetComponent<AudioSource>().clip = audio;
        GetComponent<AudioSource>().PlayOneShot(audio);
        sr.sprite = next;
    }

    void OnMouseUp()
    {
        Debug.Log("Up");
        sr.sprite = curr;
    }
    */
}
