# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A fast and flexible implementation of Rigid Body Dynamics algorithms and their analytical derivatives."
AUTHOR = "Justin Carpentier <justin.carpentier@inria.fr>"
HOMEPAGE = "https://github.com/stack-of-tasks/pinocchio"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6d936230566da2b5b6f908ac66e333a8"

ROS_CN = "pinocchio"
ROS_BPN = "pinocchio"

ROS_BUILD_DEPENDS = " \
    boost \
    doxygen \
    eigenpy \
    git \
    hpp-fcl \
    libeigen \
    python3 \
    python3-numpy \
    urdfdom \
"

ROS_BUILDTOOL_DEPENDS = " \
    clang-native-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    eigenpy \
    hpp-fcl \
    libeigen \
    python3 \
    python3-numpy \
    urdfdom \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    eigenpy \
    hpp-fcl \
    libeigen \
    python3 \
    python3-numpy \
    urdfdom \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/pinocchio-release/archive/release/rolling/pinocchio/2.6.21-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/pinocchio"
SRC_URI = "git://github.com/ros2-gbp/pinocchio-release;${ROS_BRANCH};protocol=https"
SRCREV = "597860b805cbece2461b5e75d1b572decd999c86"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
