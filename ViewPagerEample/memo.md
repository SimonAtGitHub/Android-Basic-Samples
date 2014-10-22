##ViewPager
ViewPagerで複数のViewを一気に読み込むか順番に読み込むかでフリック時の動きのなめらかさが変わる。

設定メソッド  
`setOffscreenPageLimit (int limit)`  
デフォルトは1が設定してある。

##Fragment
ViewのあるFragmentでは`onCreateView`が必須。  
そこでviewを返す。
