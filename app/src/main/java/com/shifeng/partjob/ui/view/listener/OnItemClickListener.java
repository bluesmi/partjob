package com.shifeng.partjob.ui.view.listener;

/**
 *   点击事件的接口
 *
 *  * 作者：朋来-GZQ on 2017/1/17 14:59
 *  * 邮箱：gongzhiqing@xiyundata.com
 *  
 */
public interface OnItemClickListener<V> {
    /**
     * 当item被点击的时候进行事件分发
     *
     * @param itemValue 点击的item传递的值
     * @param viewID    点击控件的id
     * @param position  被点击的item的位置
     */
    void onItemClick(V itemValue, int viewID, int position);

}
