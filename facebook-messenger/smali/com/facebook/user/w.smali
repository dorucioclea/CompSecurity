.class final Lcom/facebook/user/w;
.super Ljava/lang/Object;
.source "UserKey.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/UserKey;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/UserKey;
    .locals 2

    .prologue
    .line 162
    new-instance v0, Lcom/facebook/user/UserKey;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/UserKey;-><init>(Landroid/os/Parcel;Lcom/facebook/user/u;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 166
    new-array v0, p1, [Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 160
    invoke-virtual {p0, p1}, Lcom/facebook/user/w;->a(Landroid/os/Parcel;)Lcom/facebook/user/UserKey;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 160
    invoke-virtual {p0, p1}, Lcom/facebook/user/w;->a(I)[Lcom/facebook/user/UserKey;

    move-result-object v0

    return-object v0
.end method
